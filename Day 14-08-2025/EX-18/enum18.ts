enum HttpStatusCode {
    OK = 200,
    NOTFOUND = 404,
    ACCESSDENIED = 403,
    INTERNALERROR = 500
}

console.log("OK:", HttpStatusCode.OK);
console.log("NOT FOUND:", HttpStatusCode.NOTFOUND);
console.log("ACCESS DENIED:", HttpStatusCode.ACCESSDENIED);
console.log("INTERNAL ERROR:", HttpStatusCode.INTERNALERROR);
