<div class="container">
	<div class="row">

		<!-- To display the sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>


		</div>

		<!-- To display the products -->
		<div class="col-md-9">


			<!-- Adding the Breadcrumb so that we can see Onlineshopping/Category/product example Onlineshopping/category/SmartPhones -->
			<div class="row">
				<div class="col-lg-12">


					<c:if test="${userClickAllProducts== true }">

						<script>
							window.categoryId = '';
						</script>



						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>



						</ol>
					</c:if>




					<c:if test="${userClickCategoryProducts== true }">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>



						</ol>
					</c:if>

				</div>
			</div>

			<div class="row">
				<div class="col-xs-12">
					<table id="productListTable"
						class="table table-striped table-border">
						<thead>
							<tr>
							<th></th>
								<th>Name</th>
								<th>Brand
								<th>Price</th>
								<th>Quantity</th>
								<th></th>
							</tr>
						</thead>

						<tfoot>
							<tr>
							<th></th>
								<th>name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Quantity</th>
								<th></th>
							</tr>
						</tfoot>




					</table>
				</div>
			</div>


		</div>


	</div>
</div>