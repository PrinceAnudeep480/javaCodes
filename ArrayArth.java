class ArrayArth
{
public static void main(String[] args)
{
int[][] a={{1,2},{3,4}};

int[][] b={{5,6},{7,8}};

int add,sub,mul;

int i=0;
int j=0;
	
for(;i<=1;i++)
{
for(;j<=1;j++)
{
System.out.println(a[i][j]+ " " + b[i][j]);

add=a[i][j] + b[i][j];

sub=a[i][j] - b[i][j];

mul=a[i][j] * b[i][j];

System.out.print("  : "  + add+ "  " );
System.out.print("  : " +sub + "  " );
System.out.print("  : " +mul + "  " );
}
}
}

}