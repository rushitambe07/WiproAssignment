var HttpStatusCode;
(function (HttpStatusCode) {
    HttpStatusCode[HttpStatusCode["OK"] = 200] = "OK";
    HttpStatusCode[HttpStatusCode["NOTFOUND"] = 404] = "NOTFOUND";
    HttpStatusCode[HttpStatusCode["ACCESSDENIED"] = 403] = "ACCESSDENIED";
    HttpStatusCode[HttpStatusCode["INTERNALERROR"] = 500] = "INTERNALERROR";
})(HttpStatusCode || (HttpStatusCode = {}));
console.log("OK:", HttpStatusCode.OK);
console.log("NOT FOUND:", HttpStatusCode.NOTFOUND);
console.log("ACCESS DENIED:", HttpStatusCode.ACCESSDENIED);
console.log("INTERNAL ERROR:", HttpStatusCode.INTERNALERROR);
