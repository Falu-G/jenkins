// pipelineJob('pipelineJob') {
//     definition {
//         cps {
//             script(readFileFromWorkspace('pipelineJob.groovy'))
//             sandbox()
//         }
//     }
// }

pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Falu-G/springboot-api-sample.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}