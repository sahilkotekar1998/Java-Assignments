interface I1
{
    void show();
}
interface I2
{
    void disp();
}
class Main implements I1,I2
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void disp()
    {
        System.out.println("SAHIL");
    }
    public static void main(String[]args)
    {
        Main h = new Main();
        h.show();
        h.disp();

    }
}