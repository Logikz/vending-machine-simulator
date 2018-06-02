# Project Template

This is a Java Maven Project Template

# How to compile

```shell
mvn clean compile
```

# How to create a binary runable package 

```shell
mvn clean compile assembly:single
```



or 


mvn clean package


# How to run


java -cp target/*.jar edu.bu.met.cs665.Main

or

run.sh 

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


mvn findbugs:gui 

or 

mvn findbugs:findbugs


