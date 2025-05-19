class goodmorning extends Thread
{
void printGoodMorning()
{
for(int i=0<20;i++)
{
System.out.println("goodMorning");
sleep(1000);
notify();
}
}
void printHello()
{
for(int i=0<20;i++)
{
System.out.println("Hello");
sleep(2000);
notify();
}
}
void printWelcome()
{
for(int i=0<20;i++)
{
System.out.println("Welcome...");
sleep(3000);
notify();
}
}
}
class Main
{
public static void main(String []args)
{
Thread g = new Thread ();
g.printGoodMorning();
g.printGoodMorning();
g.printGoodMorning();

}