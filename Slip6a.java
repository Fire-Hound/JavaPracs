class Slip6a {
    double BasicSal;
    double NetSal;
    void setBasicSal(float sal) {
        BasicSal = sal;
    }
    void displayNetSal() {
        if(BasicSal>=10000)
        {
            NetSal=BasicSal+(BasicSal*0.20);
        }
        else if(BasicSal>=5000)
        {
            NetSal=BasicSal+(BasicSal*0.10);
        }
        else if(BasicSal>=3000)
        {
            NetSal=BasicSal+(BasicSal*0.05);
        }
        else
        {
            NetSal=BasicSal+(BasicSal*0.02);
        }
        System.out.println("Basic sal: "+BasicSal);
        System.out.println("Net sal: "+NetSal);
    }
    public static void main(String[] args) {
        Slip6a s = new Slip6a();
        s.setBasicSal(5000f);
        s.displayNetSal();
    }
}