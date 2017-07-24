package polymorphism;

public class rule1 {
	void m1(){System.out.println("m1");}


void m1(int a){
	System.out.println("m2");
	
}
rule1(){
	System.out.println("con1");
}
rule1(int a){
	System.out.println("con2");
}

void m1(char ch){System.out.println("m3");}
public static void main(String[] args){
	new rule1().m1();
	new rule1(10).m1(10);
	new rule1().m1('s');
	//new child().marry();
}

}
