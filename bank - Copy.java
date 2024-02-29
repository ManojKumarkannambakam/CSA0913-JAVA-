class bank
{double p,n,r,sintrest,iintrest,aintrest;
void get(double pr,double no)
{p=pr;
n=no;
}
void sbi(double r)
{sintrest=(p*n*r)/100;
}
void icici(double r)
{
iintrest=(p*n*r)/100;
}
void axis(double r)
{
aintrest=(p*n*r)/100;
}

void display()
{
System.out.println("sintrest:"+sintrest);
System.out.println("iintrest:"+iintrest);
System.out.println("aintrest:"+aintrest);
}
public static void main(String args[])
{bank b= new bank();
b.get(100000,5);
b.sbi(8.4);
b.icici(7.3);
b.axis(9.7);
b.display();
}
}