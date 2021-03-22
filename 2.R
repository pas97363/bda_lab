a=c(rep("control",3),rep("ear removal",4),rep("fake ear removal",3))
a
xfact=factor(a)
xfact
nlevels(xfact)
length(xfact)
b=c(rep(7.25,25),rep(29.12,15),rep(3.14,58))
b
length(b)
table1=data.frame(b)
table1
table(b)
typeof(b)