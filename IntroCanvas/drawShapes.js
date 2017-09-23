//drawing line
ctx.beginPath();
ctx.moveTo(0,0);
ctx.lineTo(300,150);
ctx.stroke();

// drawing rectangle
var ctx=c.getContext("2d");
ctx.rect(20,20,150,100);
ctx.stroke();

//Drawing Triangle
function draw() {
  var canvas = document.getElementById('canvas');
  if (canvas.getContext) {
    var ctx = canvas.getContext('2d');

    ctx.beginPath();
    ctx.moveTo(75, 50);
    ctx.lineTo(100, 75);
    ctx.lineTo(100, 25);
    ctx.fill();
  }
}


//drawing Circle
ctx.beginPath();
ctx.arc(100,75,50,0,2*Math.PI);
ctx.stroke();

JavaScript syntax:	context.arc(x,y,r,sAngle,eAngle,counterclockwise);

//These are the basic shapes of canvas HTML 5
