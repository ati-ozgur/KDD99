require(Hmisc)
require(hash)

# Some data for our table
x <- 1:5
df <- data.frame(x=x, x2=x^2,x3=x^3, x0.5=sqrt(x))


# First version - without mapping
a <- latex(df ,rowlabel="",file="table.tex")


# Second version - column names mapped using a hash object
map <- function(vals){
  col.map <- hash( x = "$x^1$",
                   x2 = "$x^2$",
                   x3 = "$x^3$",
                   x0.5 = "$\\sqrt x$")
  
  lapply(vals, function(v)col.map[[v]])
}

colnames(df) <- map(colnames(df))
a <- latex(df, rowlabel="", file="table.mapped.tex")
