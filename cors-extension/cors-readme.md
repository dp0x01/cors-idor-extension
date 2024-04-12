# CORS Extension

This extension checks for Cross-Origin Resource Sharing (CORS) related headers in HTTP request headers.

## Usage

- Install the extension in OWASP ZAP.
- The extension will automatically check for CORS-related headers in intercepted HTTP requests.

For more information, refer to the [CorsExtension.java](src/main/java/extension/CorsExtension.java) and [CorsHeaderChecker.java](src/main/java/extension/CorsHeaderChecker.java) files.
