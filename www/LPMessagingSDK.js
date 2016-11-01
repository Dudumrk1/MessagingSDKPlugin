//var exec = require('cordova/exec');
//
//function LPMessagingSDK() {
// console.log("LPMessagingSDK.js: is created");
//}
//
//LPMessagingSDK.prototype.startConversation = function(aString){
// console.log("LPMessagingSDK.js: startConversation");
//
// exec(function(result){
//     /*alert("OK" + reply);*/
//   },
//  function(result){
//    /*alert("Error" + reply);*/
//   },"LPMessagingSDK",aString,[]);
//}
//
// var lpMessagingSDK = new LPMessagingSDK();
// module.exports = LPMessagingSDK;


/*global cordova, module*/

module.exports = {
    greet: function (accountId, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "LPMessagingSDK", "startConversation", [accountId]);
    }
};