    <!--Login overlay container begins here-->
    <div class="overlay_content posF" id="loginCont">
        <div class="login_content_inner">
            <div class="closeBtn_popup fR" onclick="popupclose('loginCont', 'black_overlay')"></div>
            <form>
                <h3 class="mB10 fS18 fW600">Login with</h3> 
                <div class="mB10 clearfix"> 
                    <a class="fL mL20 brdrRGrey" href="javascript:void(0)"><span class="facebookLogo fL mR20"></span> </a>
                    <a class="fL mL20" href="javascript:void(0)"> <span class="gmailLogo fR"></span> </a>
                </div>
                <p class="tC fW400">or</p>
                <h3 class="mB10 fS18 fW600">Ezeego1</h3>
                <input type="text" placeholder="Enter username" class="w100pcnt mB5" />
                <input type="password" placeholder="Enter password" class="w100pcnt mB15" />
                <div class="mB5 clearfix">
                    <input type="checkbox" id="rememberMe" /> 
                    <label for="rememberMe">Remember me</label>
                </div>
               <a href="javascript:void(0)" onclick="popupclose('loginCont', 'black_overlay'), popupwin('forgotPassword', 'black_overlay')" class="fL">Forgot password?</a>
                <div class="cB"></div>
               <a href="javascript:void(0);" class="button button-primary fR mB10" onclick="loginUser(), popupclose('loginCont', 'black_overlay')">Login</a>
                <div class="cB"></div>
               <a href="javascript:void(0)" onclick="popupclose('loginCont', 'black_overlay'), popupwin('signupContainer', 'black_overlay')">New user? Create an account</a>
            </form>
        </div>
    </div>


    <!--Signup overlay container begins here-->
    <div class="overlay_content posF" id="signupContainer">
        <div class="login_content_inner">
            <div class="closeBtn_popup fR" onclick="popupclose('signupContainer', 'black_overlay')"></div>
            <form>
                <h3 class="mB10 fS18 fW600">Sign up with</h3> 
                <div class="mB10 clearfix"> 
                    <a class="fL mL20 brdrRGrey" href="javascript:void(0)"><span class="facebookLogo fL mR20"></span> </a>
                    <a class="fL mL20" href="javascript:void(0)"> <span class="gmailLogo fR"></span> </a>
                </div>
                <p class="tC fW400">or</p>
                <h3 class="mB10 fS18 fW600">Ezeego1</h3>
               <input type="text" placeholder="Enter username" class="w100pcnt mB5" />
               <input type="password" placeholder="Enter password" class="w100pcnt mB5" />
                <input type="password" placeholder="Confirm password" class="w100pcnt mB15" />
                <div class="mB5 clearfix">
                    <input type="checkbox" id="tAndC1" />
                    <label for="tAndC1">I agree to the <a href="javascript:void(0)">Terms &amp; Conditions</a></label>
                </div>
                <div class="mB5 clearfix">
                     <input type="checkbox" id="subscribe1" />
                    <label for="subscribe1">Subscribe to the newsletter, travel offers &amp; deals</label>
                </div>
                <a href="javascript:void(0);" class="button button-primary fR mB10" onclick="popupclose('signupContainer', 'black_overlay'), popupwin('signupSuccess', 'black_overlay')">Sign up</a>
                <div class="cB"></div>
                <a href="javascript:void(0)" onclick="popupclose('signupContainer', 'black_overlay'), popupwin('loginCont', 'black_overlay')">Already a member? Login</a>
            </form>
        </div>
    </div>


    <!--sign up success overlay begins here -->
    <div class="overlay_content posF" id="signupSuccess">
        <article class="login_content_inner">
            <div class="closeBtn_popup fR" onclick="popupclose('signupSuccess', 'black_overlay')"></div>
            <h2 class="mB15 fS18 fW600">Sign up</h2> 
            <h3 class="mB15 fS16"> Congratulations!</h3>
            <p class="mB10">You have successfully created your account. <br /> Please click on the verification link sent to <span class="fW400">anil.sabharwal@gmail.com</span></p>
            <p  class="mB10">Did not receive verification link?<br /><a href="javascript:void(0)">Resend verification link</a></p>
        </article>
    </div>   

    <!--  Forgot password overlay begins here -->
    <div class="overlay_content posF" id="forgotPassword">
        <div class="login_content_inner">
        <div class="closeBtn_popup fR" onclick="popupclose('forgotPassword', 'black_overlay')"></div>
        <form>
            <h3 class="mB20 fS18 fW600">Forgot password</h3> 
            <p class="mB10">Please enter your e-mail address &amp; we will send you a confirmation mail to reset your password.</p>
            <input type="text" placeholder="Enter email address" class="w100pcnt mB15" />
            <a href="javascript:void(0);" class="button button-primary fR" onclick="popupclose('forgotPassword', 'black_overlay'), popupwin('forgotPasswordSuccess', 'black_overlay')">Submit</a>
            <div class="cB"></div>
        </form>
        </div>
    </div>     

    <!-- Forgot password success -->
    <div class="overlay_content posF" id="forgotPasswordSuccess">
        <div class="login_content_inner">
            <div class="closeBtn_popup fR" onclick="popupclose('forgotPasswordSuccess', 'black_overlay')"></div>
            <div class="pD10 clearfix pT0">
                <div class="mB20 fS18 fW600">Forgot password</div> 
                <p class="mB10">We have sent a verification link to anil.sabhrwal@gmail.com.</p>
            </div>
        </div>
    </div>

    <div class="black_overlay" id="black_overlay"></div>
