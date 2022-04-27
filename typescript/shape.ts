class Shape { 
   Area:number
   Area1:number
   l:number
   w:number
   s:number
   constructor(){
   
   }
 /*  constructor(l:number,w:number){ 
      this.l=l
	  this.w=w
	  //this.s=s
   }*/
}   

class Rectangle extends Shape { 
    
   disp():void { 

	   this.Area = this.l * this.w;
      console.log("Area of the Rectangle:  "+this.Area) 
	 // this.Area1 = this.s * this.s;
      //console.log("Area of the Square:  "+this.Area1) 
   } 
}

class Square extends Shape {
	
   disp():void {
	   //s:number
	   this.Area = this.s * this.s;
      console.log("Area of the Square:  "+this.Area) 
   } 
}
  
var obj1 = new Square() 
obj1.s = 6
obj1.disp()

var obj = new Rectangle() 
obj.l = 2
obj.w=3
obj.disp()

