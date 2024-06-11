import java.lang.Exception;
class MyException extends
Exception{
    String msg;
    public MyException(String msg){
        this.msg=msg;
    }
    public String toString(){
        return "Message:-"+this.msg;
    }
}
class UserDefineException{
    public static void Div(int a,int b){
        int x[]=new int[2];
        x[0]=a;
        x[1]=b;
        System.out.println(x[0]/x[1]);
        System.out.println("End...");
    }
    public static void main(String[] args){
        int p=12;
        int q=5;
        try{
            if(q==5)
            throw new MyException("Cannot divide by 5");
            UserDefineException.Div(p,q);
        }
        catch(MyException e){
            System.out.println("Catch...");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Catch...");
            System.out.println("End...");
        }
        System.out.println("...End...");
    }
}