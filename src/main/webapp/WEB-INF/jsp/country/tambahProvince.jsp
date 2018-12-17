<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<form action="#" method="get" id="form-province-tambah"
	class="form-horizontal">

	<!-- Code -->
	<div class="form-group">
		<label class="control-label col-md-3" for="code">Code</label>
		<div class="col-md-8">
			<input type="text" id="code" name="code" class="form-control"
				required="required" placeholder="Code">
		</div>
	</div>

	<!-- Name -->
	<div class="form-group">
		<label class="control-label col-md-3" for="name">Name</label>
		<div class="col-md-8">
			<input type="text" id="name" name="name"
				class="form-control" required="required"
				placeholder="Name">
		</div>
	</div>

	<!-- Submit Button -->
	<div class="modal-footer">
		<button type="reset" class="btn btn-primary btn-sm">Close</button>
		<button type="submit" class="btn btn-primary btn-sm">Save</button>
	</div>
</form>