
const { spawn } = require('child_process');

// run client in a deidcated process to not block other actions
const child = spawn('./gradlew', ['runClient']);

// relay log back to us
child.stderr.on('data', (data) => {
    const line = data.toString();
    process.stdout.write(line);
});

child.stdout.on('data', (data) => {
    const line = data.toString();
    process.stdout.write(line);
});