<div class="container">

	<div class="row">
		
		<!-- to display sidebar -->
		<div class="col-md-3">
			<%@ include file="./shared/sidebar.jsp" %>
		</div>
		
		<!-- to display list of products -->
		<div class="col-md-9">
		
			<!--  added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">
					<!--  if user clicks all products -->
					<c:if test="${userClickAllProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					
					<!-- if user clicks category -->
					<c:if test="${userClickCategoryProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
			<div class="row">
			
			</div>
		</div>
		
	</div>
</div>