
const { exec } = require('child_process');

// run client in a deidcated process to not block other actions
exec("gradlew runClient", (error, stdout, stderr) => {
    console.log(`stdout: ${stdout}`)
    console.error(`stderr: ${stderr}`)
})
