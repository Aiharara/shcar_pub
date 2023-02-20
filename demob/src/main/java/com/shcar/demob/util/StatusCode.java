package com.shcar.demob.util;


import lombok.*;

/**
 * 1xx informational response
 * 100 Continue
 * 101 Switching Protocols
 * 102 Processing (WebDAV; RFC 2518)
 * 103 Early Hints (RFC 8297)
 *
 * 2xx success
 * 200 OK
 * 201 Created
 * 202 Accepted
 * 203 Non-Authoritative Information (since HTTP/1.1)
 * 204 No Content
 * 205 Reset Content
 * 206 Partial Content (RFC 7233)
 * 207 Multi-Status (WebDAV; RFC 4918)
 * 208 Already Reported (WebDAV; RFC 5842)
 * 226 IM Used (RFC 3229)
 *
 * 3xx redirection
 * 300 Multiple Choices
 * 301 Moved Permanently
 * 302 Found (Previously "Moved temporarily")
 * 303 See Other (since HTTP/1.1)
 * 304 Not Modified (RFC 7232)
 * 305 Use Proxy (since HTTP/1.1)
 * 306 Switch Proxy
 * 307 Temporary Redirect (since HTTP/1.1)
 * 308 Permanent Redirect (RFC 7538)
 *
 * 4xx client errors
 * 400 Bad Request
 * 401 Unauthorized (RFC 7235)
 * 402 Payment Required
 * 403 Forbidden
 * 404 Not Found
 * 405 Method Not Allowed
 * 406 Not Acceptable
 * 407 Proxy Authentication Required (RFC 7235)
 * 408 Request Timeout
 * 409 Conflict
 * 410 Gone
 * 411 Length Required
 * 412 Precondition Failed (RFC 7232)
 * 413 Payload Too Large (RFC 7231)
 * 414 URI Too Long (RFC 7231)
 * 415 Unsupported Media Type (RFC 7231)
 * 416 Range Not Satisfiable (RFC 7233)
 * 417 Expectation Failed
 * 418 I'm a teapot (RFC 2324, RFC 7168)
 * 421 Misdirected Request (RFC 7540)
 * 422 Unprocessable Entity (WebDAV; RFC 4918)
 * 423 Locked (WebDAV; RFC 4918)
 * 424 Failed Dependency (WebDAV; RFC 4918)
 * 425 Too Early (RFC 8470)
 * 426 Upgrade Required
 * 428 Precondition Required (RFC 6585)
 * 429 Too Many Requests (RFC 6585)
 * 431 Request Header Fields Too Large (RFC 6585)
 * 451 Unavailable For Legal Reasons (RFC 7725)
 *
 * 5xx server errors
 * 500 Internal Server Error
 * 501 Not Implemented
 * 502 Bad Gateway
 * 503 Service Unavailable
 * 504 Gateway Timeout
 * 505 HTTP Version Not Supported
 * 506 Variant Also Negotiates (RFC 2295)
 * 507 Insufficient Storage (WebDAV; RFC 4918)
 * 508 Loop Detected (WebDAV; RFC 5842)
 * 510 Not Extended (RFC 2774)
 * 511 Network Authentication Required (RFC 6585)
 */


/**
 * This enum include most Status Code, and it's corresponding message
 */
@Getter
public enum StatusCode {
    // 1xx
    Continue(101, "Continue"),
    SwitchingProtocols(101, "Switching Protocols"),
    Processing(102, "Processing"),
    EarlyHints(103, "Early Hints (RFC 8297)"),

    // 2xx
    OK(200, "OK"),
    Created(201, "Created"),
    Accepted(202, "Accepted"),
    NonAuthoritativeInformation(203, "Non-Authoritative Information (since HTTP/1.1)"),
    NoContent(204, "No Content"),
    ResetContent(205, "Reset Content"),
    PartialContent(206, "Partial Content (RFC 7233)"),
    MultiStatus(207, "Multi-Status (WebDAV; RFC 4918)"),
    AlreadyReported(208, "Already Reported (WebDAV; RFC 5842)"),
    IMUsed(226, "IM Used (RFC 3229)"),

    // 3xx
    MultipleChoices(300, "Multiple Choices"),
    MovedPermanently(301, "Moved Permanently"),
    Found(302, "Found (Previously Moved temporarily)"),
    SeeOther(303, "See Other (since HTTP/1.1)"),
    NotModified(304, "Not Modified (RFC 7232)"),
    UseProxy(305, "Use Proxy (since HTTP/1.1)"),
    SwitchProxy(306, "Switch Proxy"),
    TemporaryRedirect(307, "Temporary Redirect (since HTTP/1.1)"),
    PermanentRedirect(308, "Permanent Redirect (RFC 7538)"),

    // 4xx
    BadRequest(400, "Bad Request"),
    Unauthorized(401, "Unauthorized (RFC 7235)"),
    PaymentRequired(402, "Payment Required"),
    Forbidden(403, "Forbidden"),
    NotFound(404, "Not Found"),
    MethodNotAllowed(405, "Method Not Allowed"),
    NotAcceptable(406, "Not Acceptable"),
    ProxyAuthenticationRequired(407, "Proxy Authentication Required (RFC 7235)"),
    RequestTimeout(408, "Request Timeout"),
    Conflict(409, "Conflict"),
    Gone(410, "Gone"),
    LengthRequired(411, "Length Required"),
    PreconditionFailed(412, "Precondition Failed (RFC 7232)"),
    PayloadTooLarge(413, "Payload Too Large (RFC 7231)"),
    URITooLong(414, "URI Too Long (RFC 7231)"),
    UnsupportedMediaType(415, "Unsupported Media Type (RFC 7231)"),
    RangeNotSatisfiable(416, "Range Not Satisfiable (RFC 7233)"),
    ExpectationFailed(417, "Expectation Failed"),
    IMAteapot(418, "I'm a teapot (RFC 2324, RFC 7168)"),
    MisdirectedRequest(421, "Misdirected Request (RFC 7540)"),
    UnprocessableEntity(422, "Unprocessable Entity (WebDAV; RFC 4918)"),
    Locked(423, "Locked (WebDAV; RFC 4918)"),
    FailedDependency(424, "Failed Dependency (WebDAV; RFC 4918)"),
    TooEarly(425, "Too Early (RFC 8470)"),
    UpgradeRequired(426, "Upgrade Required"),
    PreconditionRequired(428, "Precondition Required (RFC 6585)"),
    TooManyRequests(429, "Too Many Requests (RFC 6585)"),
    RequestHeaderFieldsTooLarge(431, "Request Header Fields Too Large (RFC 6585)"),
    UnavailableForLegalReasons(451, "Unavailable For Legal Reasons (RFC 7725)"),

    // 5xx
    InternalServerError (500, "Internal Server Error"),
    NotImplemented (501, "Not Implemented"),
    BadGateway (502, "Bad Gateway"),
    ServiceUnavailable (503, "Service Unavailable"),
    GatewayTimeout (504, "Gateway Timeout"),
    HTTPVersionNotSupported (505, "HTTP Version Not Supported"),
    VariantAlsoNegotiates (506, "Variant Also Negotiates (RFC 2295)"),
    InsufficientStorage (507, "Insufficient Storage (WebDAV; RFC 4918)"),
    LoopDetected (508, "Loop Detected (WebDAV; RFC 5842)"),
    NotExtended (510, "Not Extended (RFC 2774)"),
    NetworkAuthenticationRequired (511, "Network Authentication Required (RFC 6585)");



    private final Integer code;
    private final String message;
    StatusCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "StatusCode{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//        System.out.println(StatusCode.OK);
//    }

    //    // generator
//    public static void main(String[] args) {
//        String[] s = """
//                * 500 Internal Server Error
//                * 501 Not Implemented
//                * 502 Bad Gateway
//                * 503 Service Unavailable
//                * 504 Gateway Timeout
//                * 505 HTTP Version Not Supported
//                * 506 Variant Also Negotiates (RFC 2295)
//                * 507 Insufficient Storage (WebDAV; RFC 4918)
//                * 508 Loop Detected (WebDAV; RFC 5842)
//                * 510 Not Extended (RFC 2774)
//                * 511 Network Authentication Required (RFC 6585)""".split("\n");
//
//        for (String ss: s) {
//            String sub1 = ss.trim().substring(6);
//            String temp = sub1;
//            temp = temp.replace(" (", "\n");
//            String sub2 = temp.split("\n")[0];
//            sub2 = sub2.replace(" ", "").replace("-","");
//            String sub3 = ss.trim().substring(2,5);
//
//            System.out.println(sub2+" ("+sub3+", \""+sub1+"\"),");
//        }
//    }

}

