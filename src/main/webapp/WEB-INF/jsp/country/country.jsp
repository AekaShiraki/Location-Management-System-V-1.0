<div class="box box-danger">
	<div class="box-header with-border">
		<h3 class="box-title">COUNTRY LIST</h3>
		<div class="box-tools">
			<div class="input-group input-group-sm" style="width: 200px;">

				<div class="input-group-btn">
				
				<!-- Add Button -->
					<button type="button" id="button-tambah"
						class="btn btn-primary btn-sm" data-toggle="tooltip"
						data-placement="top" title="Create Data">
						<i class="fa fa-plus-square"></i>
					</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Table Header List -->
	<div class="box-body">
		<table class="table table-striped table-hover" id="table-country">
			<thead>
				<tr>
					<th>Code</th>
					<th>Name</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody id="list-data-country">

			</tbody>
		</table>
	</div>

	<!-- Modal Input -->
	<div class="modal fade" id="modal-input">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" style="background-color: #605ca8;">
					<h4 class="modal-title" style="color: white;"></h4>
				</div>

				<div class="modal-body"></div>
			</div>
		</div>
	</div>
	
	<!-- Modal Input Province -->
	<div class="modal fade" id="modal-province">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" style="background-color: #605ca8;">
					<h4 class="modal-title" style="color: white;"></h4>
				</div>

				<div class="modal-body"></div>
			</div>
		</div>
	</div>

	<!-- Modal Alert Added -->
	<div class="modal fade" id="modal-alert1">
		<div class="modal-dialog">
			<div class="alert alert-success alert-dismissible">
				<h4 class="modal-title">
					<i class="icon fa fa-check"></i>Success!
				</h4>
				Data Successfully Added ...
			</div>
		</div>
	</div>

	<!-- Modal Alert Updated -->
	<div class="modal fade" id="modal-alert2">
		<div class="modal-dialog">
			<div class="alert alert-success alert-dismissible">
				<h4 class="modal-title">
					<i class="icon fa fa-check"></i>Success!
				</h4>
				Data Successfully Updated ...
			</div>
		</div>
	</div>

	<!-- Modal Alert Deactivated -->
	<div class="modal fade" id="modal-deactivate">
		<div class="modal-dialog">
			<div class="alert alert-warning alert-dismissible">
				<h4 class="modal-title">
					<i class="icon fa fa-question-circle"></i>Confirmation
				</h4>

				<div class="modal-body"></div>
			</div>
		</div>
	</div>

</div>

<script>
	/* List Country */
	listDataCountry();

	function listDataCountry() {
		$.ajax({
			url : "country/list.html",
			type : "get",
			dataType : "html",
			success : function(result) {
				$("#list-data-country").html(result);
			}
		});
	}
	
	function listDataProvince() {
		$.ajax({
			url : "country/listProvince.html",
			type : "get",
			dataType : "html",
			success : function(result) {
				$("#list-data-province").html(result);
			}
		});
	}

	/* ON DOCUMENT READY */
	$(document).ready(
			function() {

				/* Add Popup Show */
				$("#button-tambah").on(
						"click",
						function() {
							$.ajax({
								url : "country/tambah.html",
								type : "get",
								dataType : "html",
								success : function(result) {
									$("#modal-input").find(".modal-title")
											.html("ADD BIODATA");
									$("#modal-input").find(".modal-body").html(
											result);
									$("#modal-input").modal("show");
								}
							});
						});
				
				/* Add Popup Hide */
				$("#modal-input").on("reset", "#form-country-tambah",
						function() {
									$("#modal-input").modal("hide");		
							});

				/* Add Biodata */
				$("#modal-input").on("submit", "#form-country-tambah",
						function() {
							$.ajax({
								url : "country/create.json",
								type : "get",
								dataType : "json",
								data : $(this).serialize(),
								success : function(result) {
									$("#modal-alert1").find(".modal-title");
									$("#modal-alert1").modal("show");
									$("#modal-input").modal("hide");
									listDataCountry();
								}
							});
							return false;
						});
				
				/* Edit Popup Hide */
				$("#modal-input").on("reset", "#form-country-edit",
						function() {
									$("#modal-input").modal("hide");		
							});

				/* Edit Popup Show */
				$("#list-data-country").on(
						"click",
						"#btn-edit",
						function() {
							var id = $(this).val();
							$.ajax({
								url : "country/edit.html",
								type : "get",
								dataType : "html",
								data : {
									id : id
								},
								success : function(result) {
									$("#modal-input").find(".modal-title")
											.html("FORM VIEW");
									$("#modal-input").find(".modal-body").html(
											result);
									$("#modal-input").modal("show");
								}
							});
						});

				/* Edit Country */
				$("#modal-input").on("submit", "#form-country-edit",
						function() {
							$.ajax({
								url : "country/edit/save.json",
								type : "get",
								dataType : "json",
								data : $(this).serialize(),
								success : function(result) {
									$("#modal-alert2").find(".modal-title");
									$("#modal-alert2").modal("show");
									listDataCountry();
								}
							});
							return false;
						});
				
				/* =============================   PROVINCE   ============================= */
				/* Add Popup Show */
				$("#modal-input").on("click", "#button-province-tambah",
						function() {
							$.ajax({
								url : "country/tambahProvince.html",
								type : "get",
								dataType : "html",
								success : function(result) {
									$("#modal-province").find(".modal-title")
											.html("Form Province");
									$("#modal-province").find(".modal-body").html(
											result);
									$("#modal-province").modal("show");
								}
							});
						});
				
				/* Add Province */
				$("#modal-province").on("submit", "#form-province-tambah",
						function() {
							$.ajax({
								url : "country/createProvince.json",
								type : "get",
								dataType : "json",
								data : $(this).serialize(),
								success : function(result) {
									$("#modal-alert1").find(".modal-title");
									$("#modal-alert1").modal("show");
									$("#modal-province").modal("hide");
									listDataCountry();
								}
							});
							return false;
						});
			});
</script>