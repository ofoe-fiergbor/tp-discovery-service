module.exports = {
  apps: [
    {
      name: 'aws-codedeploy',
      script: 'npx',
      args: 'serve -s build -l 8761 -n',
      interpreter: 'none',
      env: {
        NODE_ENV: 'development',
      },
    },
  ],
}