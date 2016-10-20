demo of stored XSS vulnerability in Grails 2 using `g:select` tag


	./grailsw -Dserver.port=8090 run-app


Stored value created in [Bootstrap.groovy](https://github.com/gschueler/grails2-xss-demo1/blob/master/grails-app/conf/BootStrap.groovy#L7)

Usage of select tag in [index.gsp](https://github.com/gschueler/grails2-xss-demo1/blob/master/grails-app/views/index.gsp#L11)