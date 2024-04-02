<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Repository Report</title>
</head>
<body>
    <h1>Repository Report</h1>
    <table border="1">
        <tr>
            <th>Person ID</th>
            <th>Name</th>
            <th>Documents</th>
        </tr>
        <#list repository.documents as personDocuments>
            <tr>
                <td>${personDocuments.key.id}</td>
                <td>${personDocuments.key.name}</td>
                <td>
                    <ul>
                    <#list personDocuments.value as document>
                        <li>${document.fileName} (${document.fileType}): ${document.fileSize} bytes</li>
                    </#list>
                    </ul>
                </td>
            </tr>
        </#list>
    </table>
</body>
</html>

