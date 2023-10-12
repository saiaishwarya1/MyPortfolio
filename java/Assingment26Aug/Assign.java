package Assingment26Aug;

abstract class pen
{
abstract void write();
abstract void refill();
}

class fountain_Pen extends pen
{
void write()
{System.out.println("Written in the write method");}

void refill() {
	System.out.println("Pen is refilled");
	
}

void Nib()
{
	System.out.println("Inside nib method");
}
}


class monkey
{
void jump()
{
	System.out.println("Monkey is jumping");
}

void bite()
{
	System.out.println("Monkey bites ");
}
}


class human extends monkey implements animal
{


public void eat() {
	System.out.println("Monkey is eating ");
	
}

public void sleep()
{
	System.out.println("Monkey is sleeping");
	
}

}

interface animal
{
void eat();

void sleep();
}


public class Assign {

	public static void main(String[] args) {
		fountain_Pen p = new fountain_Pen();
		p.write();
		p.refill();
		p.Nib();
				
		
		human h = new human();
		h.bite();
		h.eat();
		h.jump();
		h.sleep();
		
	}

}
