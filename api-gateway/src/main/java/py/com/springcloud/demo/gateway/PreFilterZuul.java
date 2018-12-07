package py.com.springcloud.demo.gateway;


//@Component
public class PreFilterZuul{ //extends ZuulFilter{

//	@Override
//	public Object run() {
//		System.out.println("RUUUUUUUN del zuul filter" );
//		
//		  RequestContext ctx = RequestContext.getCurrentContext();
//		    HttpServletRequest request = ctx.getRequest();
//
//		    String header = request.getHeader("Authorization");
//		    if (header == null || header.isEmpty() || !header.startsWith("Bearer ")) {
//		        ctx.setResponseStatusCode(401);
//		        ctx.setSendZuulResponse(false);
//		    } 
//		    
////		    else {
////		        header = header.replace("Bearer ", "");
////		        log.info("Token is '" + header + "'");
////		        ResponseEntity<String> responseToken = authenticationServiceClient.validateToken(header);
////		        String jwtToken = responseToken.getBody();
////
////		        //request.setAttribute("jwt", jwtToken);
////		        HttpServletRequestWrapper wrappedRequest = modifyRequest(request, jwtToken);
////		        /*wrappedRequest.setAttribute("jwt", jwtToken);*/
////		        ctx.setRequest(wrappedRequest);
////
////		        if (responseToken == null) {
////		            ctx.setResponseStatusCode(500);
////		            ctx.setResponseBody("AuthenticationService Not Available");
////		            ctx.setSendZuulResponse(false);
////		        } else {
////		            log.info(responseToken.getStatusCode().name());
////		            log.info(responseToken.getBody().toString());
////		        }
////		    }
////		    log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
//		    
//		    System.out.println("Ahora el autorizaion" );
//		    System.out.println("Authorization"+header );
//		    System.out.println("Ahora el autorizaion" );
//		    System.out.println("Ahora el autorizaion" );
//		    
//		return "DEspeus";
//	}
//
//	@Override
//	public boolean shouldFilter() {
//		System.out.println("El shuold Filter" );
//		return true;
//	}
//
//	@Override
//	public int filterOrder() {
//		return 6; // run before PreDecoration
//	}
//
//	@Override
//	public String filterType() {
//		return "pre" ;
//	}

}
