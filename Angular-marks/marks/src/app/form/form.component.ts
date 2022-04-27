import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  contactform:FormGroup;
  
  constructor() { 
    this.contactform=new FormGroup({
      sname:new FormControl("",[Validators.required,Validators.minLength(2)]),
      std:new FormControl("",[Validators.required]),
      rollno:new FormControl("",[Validators.required]),
      maths:new FormControl("",[Validators.required,Validators.min(40),Validators.max(100)]),
      physics:new FormControl("",[Validators.required,Validators.min(40),Validators.max(100)]),
      chemistry:new FormControl("",[Validators.required,Validators.min(40),Validators.max(100)]),
      hindi:new FormControl("",[Validators.required,Validators.min(4),Validators.max(100)]),
      english:new FormControl("",[Validators.required,Validators.min(40),Validators.max(100)]),
      gender:new FormControl("",[Validators.required])
      
    });
    

  }
  public res:any;
  public grade:any;
  per(){
    this.res=((this.contactform.value.maths+this.contactform.value.physics+this.contactform.value.chemistry+this.contactform.value.hindi+this.contactform.value.english)*100)/500;
    if(this.res>=40&&this.res<=50){
      this.grade="Grade C";
    }
    else if(this.res>50&&this.res<=60){
      this.grade="Grade C+";
    }
    else if(this.res>60&&this.res<=70){
      this.grade="Grade B";
    }else if(this.res>70&&this.res<=80){
      this.grade="Grade B+";
    }
    else if(this.res>80&&this.res<=90){
      this.grade="Grade A";
    }
    else if(this.res>90&&this.res<=100){
      this.grade="Grade A+";
    }
  }
  
  ngOnInit(): void {
  }
  onSubmit():void{
    console.log(this.contactform.value);
  console.log(this.res);
   }
}
