function signIn() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                if (response === "0") {
                    alert("invalid username and password");
                } else {
                    document.getElementById("signin").innerHTML = response;
                }
            }
        }
    };
    request.open("POST", "SignIn", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("username=" + username + "&" + "password=" + password);
}

function checkSignIn() {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                document.getElementById("signin").innerHTML = response;
            }
        }
    };
    request.open("GET", "profile.jsp", true);
    request.send();
}
function signOut() {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                document.getElementById("signin").innerHTML = response;
            }
        }
    };
    request.open("GET", "SignOut", true);
    request.send();
}

function signUp() {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                document.getElementById("signin").innerHTML = response;
            }
        }
    };
    request.open("GET", "sign_up.jsp", true);
    request.send();
}

function isEmail() {
    var username = document.getElementById("username").value;
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                alert(response);
            }
        }
    };
    request.open("POST", "ValidEmail", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("username=" + username);
}


function uploadImg() {
var file = document.getElementById("f").files[0];
    var formData = new FormData();
    formData.append("file", file);
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                 var response = request.responseText;
                 document.getElementById("i").src = response;
                alert(response);

            }
        }
    };
    
    request.open("POST", "Upload", true);
    request.send(formData);
}

function viewFile() {
    var file = document.getElementById("f").files[0];
    var img = document.getElementById("i");
    var fileReader = new FileReader();
    fileReader.onload = function () {
        img.src = fileReader.result;
    };
    fileReader.readAsDataURL(file);
}

function forgetPassword() {

}