!function(e){"use strict";var t=function(t,n){this.el=e(t);this.options=e.extend({},e.fn.typed.defaults,n);this.baseText=this.el.text()||this.el.attr("placeholder")||"";this.typeSpeed=this.options.typeSpeed;this.startDelay=this.options.startDelay;this.backSpeed=this.options.backSpeed;this.backDelay=this.options.backDelay;this.strings=this.options.strings;this.strPos=0;this.arrayPos=0;this.stopNum=0;this.loop=this.options.loop;this.loopCount=this.options.loopCount;this.curLoop=0;this.stop=false;this.showCursor=this.isInput?false:this.options.showCursor;this.cursorChar=this.options.cursorChar;this.isInput=this.el.is("input");this.attr=this.options.attr||(this.isInput?"placeholder":null);this.build()};t.prototype={constructor:t,init:function(){var e=this;e.timeout=setTimeout(function(){e.typewrite(e.strings[e.arrayPos],e.strPos)},e.startDelay)},build:function(){if(this.showCursor===true){this.cursor=e('<span class="typed-cursor">'+this.cursorChar+"</span>");this.el.after(this.cursor)}this.init()},typewrite:function(e,t){if(this.stop===true)return;var n=Math.round(Math.random()*(100-30))+this.typeSpeed;var r=this;r.timeout=setTimeout(function(){var n=0;var i=e.substr(t);if(i.charAt(0)==="^"){var s=1;if(/^\^\d+/.test(i)){i=/\d+/.exec(i)[0];s+=i.length;n=parseInt(i)}e=e.substring(0,t)+e.substring(t+s)}r.timeout=setTimeout(function(){if(t===e.length){r.options.onStringTyped(r.arrayPos);if(r.arrayPos===r.strings.length-1){r.options.callback();r.curLoop++;if(r.loop===false||r.curLoop===r.loopCount)return}r.timeout=setTimeout(function(){r.backspace(e,t)},r.backDelay)}else{if(t===0)r.options.preStringTyped(r.arrayPos);var n=r.baseText+e.substr(0,t+1);if(r.attr){r.el.attr(r.attr,n)}else{r.el.text(n)}t++;r.typewrite(e,t)}},n)},n)},backspace:function(e,t){if(this.stop===true){return}var n=Math.round(Math.random()*(100-30))+this.backSpeed;var r=this;r.timeout=setTimeout(function(){var n=r.baseText+e.substr(0,t);if(r.attr){r.el.attr(r.attr,n)}else{r.el.text(n)}if(t>r.stopNum){t--;r.backspace(e,t)}else if(t<=r.stopNum){r.arrayPos++;if(r.arrayPos===r.strings.length){r.arrayPos=0;r.init()}else r.typewrite(r.strings[r.arrayPos],t)}},n)},reset:function(){var e=this;clearInterval(e.timeout);var t=this.el.attr("id");this.el.after('<span id="'+t+'"/>');this.el.remove();this.cursor.remove();e.options.resetCallback()}};e.fn.typed=function(n){return this.each(function(){var r=e(this),i=r.data("typed"),s=typeof n=="object"&&n;if(!i)r.data("typed",i=new t(this,s));if(typeof n=="string")i[n]()})};e.fn.typed.defaults={strings:["These are the default values...","You know what you should do?","Use your own!","Have a great day!"],typeSpeed:0,startDelay:0,backSpeed:0,backDelay:500,loop:false,loopCount:false,showCursor:true,cursorChar:"|",attr:null,callback:function(){},preStringTyped:function(){},onStringTyped:function(){},resetCallback:function(){}}}(window.jQuery)