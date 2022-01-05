//import javax.net.ssl.SSLPeerUnverifiedException;
import processing.core.PApplet;

public class Sketch extends PApplet {

  //sun variables
  float circley = 500;
  float circlex = -100;
  float speedx = 1;
  float speedy = 1; 

  //moon variables
  float moony = 500;
  float moonx = -100;
  float speedx2 = 1;
  float speedy2 = 1;

  //colour change speed reduction
  double speedSlow;
  double speedSlow2;

  //for base colour
  float red = 210;
  float green = 230;
  float blue = 255;

  //loop king thing yes.
  float counter = 1;

  public void settings() {
    size(400, 400);
  }

  public void draw() {

  //when counter at 1 it runs day, after running day, the code adds one so that it will run night
  if (counter % 2 == 1){
    //qudratic formula upsidedown
    circlex = circlex + speedx;
    double placeholder;
    placeholder = (0.0025*(Math.pow(circlex,2)) + -(1*circlex) + 150);
    circley = (float)placeholder;

    //sunriser maker thinger idk
    background(red, green, blue);

    //sky blue
    if(circlex<=100){
      if(red>=135){
        red = red - 1;
      }
      if(green>=206){
        green = green - 1;
      }
      if(blue>=235){
        blue = blue - 1; 
      }
    }

    //darker sky till sunset - dark blue basically
    if(circlex>=100 && circlex<275){
    //100 tiles of colour change
      if(red>=50){
        speedSlow = red - 0.5;
        red = (float)speedSlow;
      }
      if(green>=140){
        speedSlow2 = green - 0.5;
        green = (float)speedSlow2;
      }
      if(blue<=250){
        blue = blue + 1;
      }
    }
    
    //sunset baby! blue to orange then we gonna go to night (black) after
    if(circlex>=275 && circlex<=450){
    //200 tiles of colour change to work with
      if(red<=235){
        red = red + 1;
      }
      if(green>=163){
        green = green - 1;
      }
      if(blue>=96){
        blue = blue - 1;
      }
    }

    //orange to black?? - can't get rid of ugly red ):
    if(circlex>=450 && circlex<=525){
      if(red>=30){
        red = red - 3;
      }
      if(green>30){
        green = green - 2;
      }
      if(blue>30){
        blue = blue - 2; 
      }
    }

    //reset
    if(circlex == 525){
      counter++;
      circlex=-75;
      circley=500;
    }

    //hands, need to put in quad for colour change
    stroke(20,20,20);
    line(150,200,120,175);
    stroke(20,20,20);
    line(250,200,280,175);
  }
  
  //the start of night
  if (counter % 2 == 0){

    //qudartic formula upsidedown
    moonx = moonx + speedx2;
    double placeholder2;
    placeholder2 = (0.0025*(Math.pow(moonx,2)) + -(1 * moonx) + 150);
    moony = (float)placeholder2;

    background(red, green, blue);

    if(moonx>=400 && moonx<500){
      if(red<=210){
        red = red + 3;
      }
      if(green<=230){
        green = green + 3;
      }
      if(blue<255){
        blue = blue + 3; 
      }
    }

  if(moonx>1 && moonx<400){
    float randomLocationX = random(0,width);
    float randomLocationY = random(0,height);
    stroke(220,220,220);
    noStroke();
    ellipse(randomLocationX,randomLocationY,3,3);
  }  

  if(moonx>100 && moonx<400){
    float randomLocationX = random(0,width);
    float randomLocationY = random(0,height);
    stroke(220,220,220);
    noStroke();
    ellipse(randomLocationX,randomLocationY,3,3);
  }

  if(moonx>150 && moonx<400){
    float randomLocationX = random(0,width);
    float randomLocationY = random(0,height);
    stroke(220,220,220);
    noStroke();
    ellipse(randomLocationX,randomLocationY,5,5);
  }

  if(moonx>150 && moonx<400){
    float randomLocationX = random(0,width);
    float randomLocationY = random(0,height);
    stroke(220,220,220);
    noStroke();
    ellipse(randomLocationX,randomLocationY,5,5);
  }

  if(moonx>250 && moonx<400){
    float randomLocationX = random(0,width);
    float randomLocationY = random(0,height);
    stroke(220,220,220);
    noStroke();
    ellipse(randomLocationX,randomLocationY,7,7);
  }

    //reset
    if(moonx == 500){
      counter--;
      moonx=-75;
      moony=600;
    }

    stroke(240,240,240);
    line(150,200,130,175);
    stroke(240,240,240);
    line(250,200,270,175);
  }

    //the drawing/shapes that move, sun/moon
    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse(moonx, moony, 50, 50);

    stroke(red, green, blue);
    fill(red, green, blue);
    ellipse(moonx+15, moony, 45, 45);
  
    stroke(249, 240, 100);
    fill(249, 240, 100);
    ellipse(circlex, circley, 50, 50);

    //ground
    fill(255,255,255);
    noStroke();
    rect(0,300,400,300);
    
    //shadows
    if (circlex>=25 && circlex<150){
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(225,325,75,75);
    
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(250,350,50,50);
    
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(275,370,25,25);
    }

    if (circlex>=150 && circlex<250){
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(200,325,75,75);
    
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(200,355,50,50);
    
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(200,385,25,25);
    }

    if (circlex>=250 && circlex<450){
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(175,325,75,75);
    
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(150,350,50,50);
    
      stroke(145,145,145);
      fill(145,145,145);
      ellipse(125,370,25,25);
    }
      
    //snowman circle body parts (3)
    stroke(20,20,20);
    fill(240,240,240);
    ellipse(200,275,125,125);
  
    stroke(20,20,20);
    fill(240,240,240);
    ellipse(200,200,100,100);
  
    stroke(20,20,20);
    fill(240,240,240);
    ellipse(200,150,80,80);
  
    //snowman arms - in quad formula

    //eyes
    stroke(20,20,20);
    fill(50,50,50);
    ellipse(180,150,20,20);
  
    stroke(20,20,20);
    fill(50,50,60);
    ellipse(220,150,20,20);
  
    //other face parts
    stroke(20,20,20);
    line(195,175,205,175);
  
    stroke(20,20,20);
    line(175,135,185,135);
  
    stroke(20,20,20);
    line(215,135,225,135);
  
    //rocks
    stroke(50,50,50);
    fill(80,80,80);
    triangle(80,320,110,280,120,320);
  
    stroke(50,50,50);
    fill(80,80,80);
    triangle(50,330,65,300,80,330);

    stroke(50,50,50);
    fill(80,80,80);
    triangle(250,325,265,310,280,325);
  
    stroke(50,50,50);
    fill(80,80,80);
    triangle(300,330,315,300,330,330);
  } 
}

