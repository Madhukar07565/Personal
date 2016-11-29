// JavaScript Document
$(document).ready(function() {


// Code for slideshow 1
var _animate  = '';
var active = 1;
function animate() {
    _animate = setInterval(function() { 
      $('#slideshow > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow');
    },  6000);
}

$("#slideshow > div:gt(0)").hide();
animate();


// Code for slideshow 2

var _animate2  = '';
var active2 = 1;
function animate2() {
    _animate2 = setInterval(function() { 
      $('#slideshow2 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow2');
    },  43000);
}


$("#slideshow2 > div:gt(0)").hide();
animate2();


// Code for slideshow 3

var _animate3  = '';
var active3 = 1;
function animate3() {
    _animate3 = setInterval(function() { 
      $('#slideshow3 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow3');
    }, 37000);
}

$("#slideshow3 > div:gt(0)").hide();
animate3();



// Code for slideshow 4

var _animate4  = '';
var active4 = 1;
function animate4() {
    _animate4 = setInterval(function() { 
      $('#slideshow4 > div:first').fadeOut(1000).next().fadeIn(2000).end().appendTo('#slideshow4');
    },  13000);
}

$("#slideshow4 > div:gt(0)").hide();
animate4();

// Code for slideshow 5

var _animate5  = '';
var active5 = 1;
function animate5() {
    _animate5 = setInterval(function() { 
      $('#slideshow5 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow5');
    },  29000);
}



$("#slideshow5 > div:gt(0)").hide();
animate5();

// Code for slideshow 6

var _animate6  = '';
var active6 = 1;
function animate6() {
    _animate6 = setInterval(function() { 
      $('#slideshow6 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow6');
    },  15000);
}



$("#slideshow6 > div:gt(0)").hide();
animate6();

//Code for slideshow 7

var _animate7  = '';
var active7 = 1;
function animate7() {
    _animate7 = setInterval(function() { 
      $('#slideshow7 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow7');
    },  21000);
}

$("#slideshow7 > div:gt(0)").hide();
animate7();

//Code for slideshow 8

var _animate8  = '';
var active8 = 1;
function animate8() {
    _animate8 = setInterval(function() { 
      $('#slideshow8 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow8');
    },  23000);
}

$("#slideshow8 > div:gt(0)").hide();
animate8();



//Code for slideshow 9

var _animate9  = '';
var active9 = 1;
function animate9() {
    _animate9 = setInterval(function() { 
      $('#slideshow9 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow9');
    },  27000);
}


$("#slideshow9 > div:gt(0)").hide();
animate9();

//Code for slideshow 10

var _animate10  = '';
var active10 = 1;
function animate10() {
    _animate10 = setInterval(function() { 
      $('#slideshow10 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow10');
    },  15000);
}




$("#slideshow10 > div:gt(0)").hide();
animate10();


//Code for slideshow 11

var _animate11  = '';
var active11 = 1;
function animate11() {
    _animate11 = setInterval(function() { 
      $('#slideshow11 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow11');
    },  39000);
}

$("#slideshow11 > div:gt(0)").hide();
animate11();

//Code for slideshow 12
var _animate12  = '';
var active12 = 1;
function animate12() {
    _animate12 = setInterval(function() { 
      $('#slideshow12 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow12');
    },  11000);
}

$("#slideshow12 > div:gt(0)").hide();
animate12();

//Code for slideshow 13

var _animate13  = '';
var active13 = 1;
function animate13() {
    _animate13 = setInterval(function() { 
      $('#slideshow13 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow13');
    },  19000);
}

$("#slideshow13 > div:gt(0)").hide();
animate13();






});