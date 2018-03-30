var app=angular.module('routerApp',['ui.router']);
app.config(function($stateProvider,$urlRouteProvider)
{
$urlRouteProvider.otherwise('/home');
$stateProvider

  // HOME STATES AND NESTED VIEWS ========================================
  .state('home', {
      url: '/home',
      templateUrl: 'home.html'
  })

  // nested list with custom controller
  .state('homelist', {
      url: '/list',
      templateUrl: 'homelist.html',
      controller: function($scope) {
          $scope.dogs = ['Bernese', 'Husky', 'Goldendoodle'];
      }
  })

  // nested list with just some random string data
  .state('homeparagraph', {
      url: '/paragraph',
      template: 'This is paragraph.'
  })
