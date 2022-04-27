class Circle
{
	Circumference:number;
	radius :number;
	id:number;
	distanc:number;
	times:number;
	
	constructor(radius:number,id:number,distanc:number)
{
	this.radius=radius;
	this.id=id;
	this.distanc=distanc;

}
disp()
{
	this.Circumference= 2 *this.id*this.radius;
	
	this.times=this.distanc/this.Circumference;
	
	console.log("Ring rotations=" +this.times);
}
}
let C=new Circle(10,15/4,1400);
C.disp();