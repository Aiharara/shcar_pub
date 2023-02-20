let config;

let mode = "localhost";
// let mode = "webApi";
// let mode = "local";

if (mode === "webApi") {
    config = {
        $api_url: "http://api.codingfest.fun",
        timeoutDuration: 30000
    };
} else if (mode === "localhost") {
    config = {
        $api_url: "http://localhost:8080",
        timeoutDuration: 1000,
    };
} else {
    config = {
        $api_url: "",
        timeoutDuration: 30000,
    };
}

export { config }