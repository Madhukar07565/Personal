ACC.countdown = {
/**
 * if any product add/update/delete, always do repricing, then add/refresh count down info in session.
 * else
 * when got to cart page, do repricing, then add count down info to session 
 * 	{repricing: true, refreshTime:3:30, expireTime: 5:00}
 * if this info not in session then do repricing;
 * if repricing is false, then do repricing;
 * if repricing is true,
 * 		calculate expire time, 
 * 			on 3:34 then {repricing: true, refreshTime:3:30, expireTime: 1:00}, not do repricing
 * 			on 3:35 or later, then do repricing, {repricing: true, refreshTime:3:35, expireTime: 5:00}
 * if order placed, purge the count down info from session. 
 */
	_autoload : [ "startCountDown" ],
	dom : $('#countdown'),
	startCountDown : function() {
		if(ACC.countdown.dom && ACC.config.cartsection == "CART_TRAVELERS"){// TODO
			ACC.countdown.initializeClock()
		}
	},

	getTimeRemaining : function(endtime) {
		var t = endtime - Date.parse(new Date());
		var seconds = Math.floor( (t/1000) % 60 );
		var minutes = Math.floor( (t/1000/60) % 60 );
		var hours = Math.floor( (t/(1000*60*60)) % 24 );
		var days = Math.floor( t/(1000*60*60*24) );
		return {
			'total': t,
			'days' : days,
			'hours' : hours,
			'minutes' : minutes,
			'seconds' : seconds
		};
	},
	initializeClock : function(id, endtime) {
		var clock = ACC.countdown.dom;
		var expiretime = clock.data('time');
		var endTime = Date.parse(new Date()) + expiretime;
		var timeinterval = setInterval(function() {
			var t = ACC.countdown.getTimeRemaining(endTime);
			if(t.total > 0){
				clock[0].innerHTML = ACC.util.leftPad(t.hours, 2, 0) + ':' + ACC.util.leftPad(t.minutes, 2, 0) + ':' + ACC.util.leftPad(t.seconds, 2, 0);
			}else if (t.total <= 0) {
				clearInterval(timeinterval);
				ACC.countdown.refreshPage();
			}
		}, 1000);
	},

	refreshPage : function(){
		var url = window.location.href;
		window.location.href = url;//ACC.config.contextPath + "/cart";
	}
};
