var app=angular.module("loginApp",["ngRoute"]);
app.config(function($routeProvider)
{
  $routeProvider.when("/"
    {
      templateUrl :"LoginForm"
    });
});
