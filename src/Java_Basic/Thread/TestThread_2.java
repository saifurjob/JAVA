package Java_Basic.Thread;

class TestThread_2 implements Runnable
{
    public static void main(String args[])
    {

        
    }
    Thread t1 = new Thread();
//    TestThread_2 s = new TestThread_2(this, t1);

    @Override
    public void run() 
    {
        System.out.println("Runimg ");
    }
}
