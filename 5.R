data()
head(mtcars)
rnum<-nrow(mtcars)
cnum<-ncol(mtcars)
x<-data.frame(mtcars)
automatic<-0
manual<-0
for(i in 1:rnum){
  ifelse(x[i,9] == 1, manual<-manual+1, automatic<-automatic+1)
  }
print(automatic)
ifelse(automatic >= manual, print("Automatic exceeds manual"), print("Manual exceeds automatic"))
hp<-x[,4]
we<-x[,6]
scatter.smooth(hp,we,span = 2/3,degree = 1,family = c("symmetric","gaussian"))
mpg<-x[,1]
hist(mpg, breaks = 12, col = "lightgreen", border = "red")
l<-as.integer(x[,2])
m<-as.integer(x[,8])
n<-as.integer(x[,9])
newmtc<-data.frame(l,m,n)
print(newmtc)
mtcars[(mtcars$cyl<=5),]