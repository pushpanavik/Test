var app=angular.module("loginApp",["ngRoute"]);
app.config(function($stateProvider)
{
  $stateProvider.state("/"
    {
      template :"LoginForm.html"
    });

});
