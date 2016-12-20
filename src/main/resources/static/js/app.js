(function() {
  'use strict';

  angular.module('app', ['ui.router'])
    .config(config)

  config.$inject = ['$stateProvider', '$urlRouterProvider', '$locationProvider']

  function config($stateProvider, $urlRouterProvider, $locationProvider){
    $locationProvider.html5Mode(true)

    $stateProvider
      .state({
        name: 'home',
        url: '/',
        template: 'Hello! <a ui-sref="other">Other</a>',
      })
      .state({
        name: 'other',
        url: '/other',
        template: 'Other!',
      })
  }

}());