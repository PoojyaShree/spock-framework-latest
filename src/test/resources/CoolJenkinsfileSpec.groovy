public class CoolJenkinsfileSpec extends JenkinsPipelineSpecification {
def "Jenkinsfile"() {
	setup:
		def Jenkinsfile = loadPipelineScriptForTest("src/main/resources/CoolJenkinsfile.groovy")
	when:
		Jenkinsfile.run()
	then:
		1 * getPipelineMock("node")("legacy", _)
		1 * getPipelineMock("echo")("hello world")
}
}
