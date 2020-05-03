



For Project sam2-app: Its lambda function triggered by SQS events
========================================================================


Command : sam build

Building resource 'HelloWorldFunction'
Running JavaMavenWorkflow:CopySource
Running JavaMavenWorkflow:MavenBuild
Running JavaMavenWorkflow:MavenCopyDependency
Running JavaMavenWorkflow:MavenCopyArtifacts

Build Succeeded

Built Artifacts  : .aws-sam\build
Built Template   : .aws-sam\build\template.yaml

Commands you can use next
=========================
[*] Invoke Function: sam local invoke
[*] Deploy: sam deploy --guided


Commandsam deploy --guided


Configuring SAM deploy
======================

        Looking for samconfig.toml :  Found
        Reading default arguments  :  Success

        Setting default arguments for 'sam deploy'
        =========================================
        Stack Name [sam2-app]:
        AWS Region [us-west-2]:
        #Shows you resources changes to be deployed and require a 'Y' to initiate deploy
        Confirm changes before deploy [Y/n]: Y
        #SAM needs permission to be able to create roles to connect to the resources in your template
        Allow SAM CLI IAM role creation [Y/n]: Y
        Save arguments to samconfig.toml [Y/n]: Y

        Looking for resources needed for deployment: Found!

                Managed S3 bucket: aws-sam-cli-managed-default-samclisourcebucket-6qevxuk1lb84
                A different default S3 bucket can be set in samconfig.toml

        Saved arguments to config file
        Running 'sam deploy' for future deployments will use the parameters saved above.
        The above parameters can be changed by modifying samconfig.toml
        Learn more about samconfig.toml syntax at
        https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-config.html

        Deploying with following values
        ===============================
        Stack name                 : sam2-app
        Region                     : us-west-2
        Confirm changeset          : True
        Deployment s3 bucket       : aws-sam-cli-managed-default-samclisourcebucket-6qevxuk1lb84
        Capabilities               : ["CAPABILITY_IAM"]
        Parameter overrides        : {}

Initiating deployment
=====================
Uploading to sam2-app/5630c4e8259cca6577ee29a13e9714df.template  1108 / 1108.0  (100.00%)

Waiting for changeset to be created..

CloudFormation stack changeset
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
Operation                                               LogicalResourceId                                       ResourceType
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
+ Add                                                   HelloWorldFunctionMySQSEvent                            AWS::Lambda::EventSourceMapping
+ Add                                                   HelloWorldFunctionRole                                  AWS::IAM::Role
+ Add                                                   HelloWorldFunction                                      AWS::Lambda::Function
+ Add                                                   MySqsQueue                                              AWS::SQS::Queue
---------------------------------------------------------------------------------------------------------------------------------------------------------------------

Changeset created successfully. arn:aws:cloudformation:us-west-2:286660667663:changeSet/samcli-deploy1588497110/38625d08-148d-4adf-92c2-b80ad9cc3420


Previewing CloudFormation changeset before deployment
======================================================
Deploy this changeset? [y/N]: y

2020-05-03 14:42:13 - Waiting for stack create/update to complete

CloudFormation events from changeset
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
ResourceStatus                            ResourceType                              LogicalResourceId                         ResourceStatusReason
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE_IN_PROGRESS                        AWS::SQS::Queue                           MySqsQueue                                Resource creation Initiated
CREATE_IN_PROGRESS                        AWS::IAM::Role                            HelloWorldFunctionRole                    Resource creation Initiated
CREATE_IN_PROGRESS                        AWS::SQS::Queue                           MySqsQueue                                -
CREATE_IN_PROGRESS                        AWS::IAM::Role                            HelloWorldFunctionRole                    -
CREATE_COMPLETE                           AWS::SQS::Queue                           MySqsQueue                                -
CREATE_COMPLETE                           AWS::IAM::Role                            HelloWorldFunctionRole                    -
CREATE_IN_PROGRESS                        AWS::Lambda::EventSourceMapping           HelloWorldFunctionMySQSEvent              Resource creation Initiated
CREATE_IN_PROGRESS                        AWS::Lambda::EventSourceMapping           HelloWorldFunctionMySQSEvent              -
CREATE_COMPLETE                           AWS::Lambda::Function                     HelloWorldFunction                        -
CREATE_IN_PROGRESS                        AWS::Lambda::Function                     HelloWorldFunction                        Resource creation Initiated
CREATE_IN_PROGRESS                        AWS::Lambda::Function                     HelloWorldFunction                        -
CREATE_COMPLETE                           AWS::CloudFormation::Stack                sam2-app                                  -
CREATE_COMPLETE                           AWS::Lambda::EventSourceMapping           HelloWorldFunctionMySQSEvent              -
---------------------------------------------------------------------------------------------------------------------------------------------------------------------

CloudFormation outputs from deployed stack
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
Outputs
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key                 HelloWorldFunctionIamRole
Description         Implicit IAM Role created for Hello World function
Value               arn:aws:iam::286660667663:role/sam2-app-HelloWorldFunctionRole-1PNQH8LYTA1HA

Key                 HelloWorldFunction
Description         Hello World Lambda Function ARN
Value               arn:aws:lambda:us-west-2:286660667663:function:sam2-app-HelloWorldFunction-192LX9T5OMT9I
---------------------------------------------------------------------------------------------------------------------------------------------------------------------

Successfully created/updated stack - sam2-app in us-west-2





For Project sam-db to Access DynamoDB using API getway
==============================================================

Command : sam build

Building resource 'GetDynamoDBItemsFunction'
Running JavaMavenWorkflow:CopySource
Running JavaMavenWorkflow:MavenBuild
Running JavaMavenWorkflow:MavenCopyDependency
Running JavaMavenWorkflow:MavenCopyArtifacts

Build Succeeded

Built Artifacts  : .aws-sam\build
Built Template   : .aws-sam\build\template.yaml

Commands you can use next
=========================
[*] Invoke Function: sam local invoke
[*] Deploy: sam deploy --guided


Command : sam deploy --guided

Configuring SAM deploy
======================

        Looking for samconfig.toml :  Found
        Reading default arguments  :  Success

        Setting default arguments for 'sam deploy'
        =========================================
        Stack Name [sam-db]:
        AWS Region [us-west-2]:
        #Shows you resources changes to be deployed and require a 'Y' to initiate deploy
        Confirm changes before deploy [Y/n]: Y
        #SAM needs permission to be able to create roles to connect to the resources in your template
        Allow SAM CLI IAM role creation [Y/n]: Y
        GetDynamoDBItemsFunction may not have authorization defined, Is this okay? [y/N]: y
        Save arguments to samconfig.toml [Y/n]: Y

        Looking for resources needed for deployment: Found!

                Managed S3 bucket: aws-sam-cli-managed-default-samclisourcebucket-6qevxuk1lb84
                A different default S3 bucket can be set in samconfig.toml

        Saved arguments to config file
        Running 'sam deploy' for future deployments will use the parameters saved above.
        The above parameters can be changed by modifying samconfig.toml
        Learn more about samconfig.toml syntax at
        https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-config.html

        Deploying with following values
        ===============================
        Stack name                 : sam-db
        Region                     : us-west-2
        Confirm changeset          : True
        Deployment s3 bucket       : aws-sam-cli-managed-default-samclisourcebucket-6qevxuk1lb84
        Capabilities               : ["CAPABILITY_IAM"]
        Parameter overrides        : {}

Initiating deployment
=====================
Uploading to sam-db/8c1700555a0293b114c5a78f01dc1cb9  7494189 / 7494189.0  (100.00%)
GetDynamoDBItemsFunction may not have authorization defined.
Uploading to sam-db/dd2b7cf4adfe808aea0017707312f96a.template  1229 / 1229.0  (100.00%)

Waiting for changeset to be created..

CloudFormation stack changeset
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
Operation                                               LogicalResourceId                                       ResourceType
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
+ Add                                                   GetDynamoDBItemsFunctionHelloWorldPermissionProd        AWS::Lambda::Permission
+ Add                                                   GetDynamoDBItemsFunctionRole                            AWS::IAM::Role
+ Add                                                   GetDynamoDBItemsFunction                                AWS::Lambda::Function
+ Add                                                   ServerlessRestApiDeploymentfca5f0fda3                   AWS::ApiGateway::Deployment
+ Add                                                   ServerlessRestApiProdStage                              AWS::ApiGateway::Stage
+ Add                                                   ServerlessRestApi                                       AWS::ApiGateway::RestApi
---------------------------------------------------------------------------------------------------------------------------------------------------------------------

Changeset created successfully. arn:aws:cloudformation:us-west-2:286660667663:changeSet/samcli-deploy1588497428/f5ff4d65-1c08-489e-8dc7-7d16688b2895


Previewing CloudFormation changeset before deployment
======================================================
Deploy this changeset? [y/N]: y

2020-05-03 14:47:32 - Waiting for stack create/update to complete

CloudFormation events from changeset
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
ResourceStatus                            ResourceType                              LogicalResourceId                         ResourceStatusReason
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE_IN_PROGRESS                        AWS::IAM::Role                            GetDynamoDBItemsFunctionRole              -
CREATE_IN_PROGRESS                        AWS::IAM::Role                            GetDynamoDBItemsFunctionRole              Resource creation Initiated
CREATE_COMPLETE                           AWS::IAM::Role                            GetDynamoDBItemsFunctionRole              -
CREATE_IN_PROGRESS                        AWS::Lambda::Function                     GetDynamoDBItemsFunction                  -
CREATE_COMPLETE                           AWS::Lambda::Function                     GetDynamoDBItemsFunction                  -
CREATE_IN_PROGRESS                        AWS::Lambda::Function                     GetDynamoDBItemsFunction                  Resource creation Initiated
CREATE_IN_PROGRESS                        AWS::ApiGateway::RestApi                  ServerlessRestApi                         -
CREATE_COMPLETE                           AWS::ApiGateway::RestApi                  ServerlessRestApi                         -
CREATE_IN_PROGRESS                        AWS::ApiGateway::RestApi                  ServerlessRestApi                         Resource creation Initiated
CREATE_COMPLETE                           AWS::ApiGateway::Deployment               ServerlessRestApiDeploymentfca5f0fda3     -
CREATE_IN_PROGRESS                        AWS::ApiGateway::Deployment               ServerlessRestApiDeploymentfca5f0fda3     Resource creation Initiated
CREATE_IN_PROGRESS                        AWS::Lambda::Permission                   GetDynamoDBItemsFunctionHelloWorldPermi   Resource creation Initiated
                                                                                    ssionProd
CREATE_IN_PROGRESS                        AWS::Lambda::Permission                   GetDynamoDBItemsFunctionHelloWorldPermi   -
                                                                                    ssionProd
CREATE_IN_PROGRESS                        AWS::ApiGateway::Deployment               ServerlessRestApiDeploymentfca5f0fda3     -
CREATE_IN_PROGRESS                        AWS::ApiGateway::Stage                    ServerlessRestApiProdStage                -
CREATE_COMPLETE                           AWS::ApiGateway::Stage                    ServerlessRestApiProdStage                -
CREATE_IN_PROGRESS                        AWS::ApiGateway::Stage                    ServerlessRestApiProdStage                Resource creation Initiated
CREATE_COMPLETE                           AWS::Lambda::Permission                   GetDynamoDBItemsFunctionHelloWorldPermi   -
                                                                                    ssionProd
CREATE_COMPLETE                           AWS::CloudFormation::Stack                sam-db                                    -
---------------------------------------------------------------------------------------------------------------------------------------------------------------------

CloudFormation outputs from deployed stack
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
Outputs
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
Key                 GetDynamoDBItemsFunctionIamRole
Description         Implicit IAM Role created for Hello World function
Value               arn:aws:iam::286660667663:role/sam-db-GetDynamoDBItemsFunctionRole-OIRU5VZKQYUJ

Key                 GetDynamoDBItemsFunction
Description         Hello World Lambda Function ARN
Value               arn:aws:lambda:us-west-2:286660667663:function:sam-db-GetDynamoDBItemsFunction-H7QMFW3JHD23

Key                 HelloWorldApi
Description         API Gateway endpoint URL for Prod stage for Hello World function
Value               https://4cinpmfs4a.execute-api.us-west-2.amazonaws.com/Prod/hello/
---------------------------------------------------------------------------------------------------------------------------------------------------------------------

Successfully created/updated stack - sam-db in us-west-2


-----------------------------------------------------------------------------------------------------------------------
