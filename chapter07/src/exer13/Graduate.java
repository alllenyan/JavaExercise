package exer13;

class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}