#!groovy
import hudson.model.*


try {
    node {
 
        stage('checkout-and-test') {
          checkout scm
            sh"""oc process -f bpmtemplate.json -n panorama  | oc apply -f -"""
        }
        
    }
} catch (err) {
    echo "in catch block"
    echo "Caught: ${err}"
    currentBuild.result = 'FAILURE'
    throw err
}
