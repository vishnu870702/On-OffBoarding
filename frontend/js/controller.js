angular.module('LineManger', ['ngRoute'])

/*-----------------------------------
| Routes
------------------------------------*/

.config(function($routeProvider, $locationProvider){

    $routeProvider.when('/', {
        controller: 'indexCtrl',
        templateUrl: '/partials/index.html'
    })

    .when('/add-contact', {
        controller: 'addCtrl',
        templateUrl: '/partials/add.html'
    })

    .when('/contact/:id', {
        controller: 'contactCtrl',
        templateUrl: '/partials/contact.html'
    })

    .otherwise({
        redirectTo: '/'
    });

    $locationProvider.html5Mode(true);

})

/*-----------------------------------
| Truncate Filter
------------------------------------*/

.filter('truncate', function(){
    return function(input, limit){
        return (input.length > limit) ? input.substr(0, limit)+'…' : input;
    };
})

/*-----------------------------------
| Index Controller
------------------------------------*/

.controller('indexCtrl', function($scope){

})

/*-----------------------------------
| Add Controller
------------------------------------*/

.controller('addCtrl', function($scope){

})

/*-----------------------------------
| Contact Controller
------------------------------------*/

.controller('contactCtrl', function($scope, $routeParams){

    console.log($routeParams);

});