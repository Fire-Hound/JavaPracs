class Slip2a
{
    int height;
    int width;
    public static void area(Slip2a obj)
    {
        System.out.println(obj.height*obj.width);
    }
    public static void main(String[] args) {
        Slip2a a = new Slip2a();
        a.height = 12;
        a.width = 10;
        area(a);
    }
}