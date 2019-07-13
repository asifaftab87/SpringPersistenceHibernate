<%@page import="org.liferayasif.front.dto.FooterDto"%>
<%@page import="java.util.List"%>
<%@ page import="org.liferayasif.front.util.ViewWebUtil" %>

<nav class="navbar navbar-default bg-custom">
  <div class="container-fluid">
    <div class="navbar-footer">
    	<div class="footer-copyright text-center py-3 text-white">
      		<ul class="footer-copyright text-center py-3 text-white">
		<% 
			List<FooterDto> footerList = ViewWebUtil.getFooterByParent("ROOT");		
			for(FooterDto dto : footerList){
				%>
					<li class="footer-copyright text-center py-3 text-white">
						<a  href="<%= dto.getUrl() %>" style="color:white;"> <%= dto.getPageName() %></a>
						<%
							List<FooterDto> childFooterList = ViewWebUtil.getFooterByParent(dto.getPageCode());
							if(childFooterList!=null && childFooterList.size()>0){
								%>
									<ul class="footer-copyright text-center py-3 text-white">
										<%
											for(FooterDto dtoc : childFooterList){
											%>
												<li class="footer-copyright text-center py-3 text-white">
													<a href="<%= dtoc.getUrl() %>"><%= dtoc.getPageName() %></a>
												</li>
											<%
											}
										%>
									</ul>
								<%
							}
						%>
					</li>
				<%	
			}
		%> 
    </ul>
      	</div>
    </div>
  </div>
</nav>
  
<style>

.custom-font-color{
	color:white;
}
.footer-copyright{
	padding-top:12px;
}
/* change the background color */
.bg-custom {
    background-color: #007BFF;
    margin-top: 25px;
}
/* change the brand and text color */
.bg-custom .navbar-brand,
.bg-custom .navbar-text {
    color: rgba(255,255,255,.8);
}
/* change the link color */
.bg-custom .navbar-nav .nav-link {
    color: rgba(255,255,255,.5);
}
/* change the color of active or hovered links */
.bg-custom .nav-item.active .nav-link,
.bg-custom .nav-item:focus .nav-link,
.bg-custom .nav-item:hover .nav-link {
    color: #ffffff;
}

.error{
	color: red;
}
</style>