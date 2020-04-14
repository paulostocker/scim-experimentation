package com.stocker.scimexperimentation.model;

import com.unboundid.scim2.common.BaseScimResource;
import com.unboundid.scim2.common.annotations.Attribute;
import com.unboundid.scim2.common.annotations.Schema;
import com.unboundid.scim2.common.types.AttributeDefinition;
import com.unboundid.scim2.common.types.Name;

//The @Schema annotation describes the resource type, 
//including the schema ID, importantly. This information may 
//be used by other classes in the SCIM 2 SDK.
@Schema(id="urn:ietf:params:scim:schemas:core:2.0:User",
 name="User", description = "User Account")
public class UserResource extends BaseScimResource
{
// The @Attribute annotation is used to describe each attribute.
@Attribute(description = "Unique identifier for the User typically " +
   "used by the user to directly authenticate to the service provider.",
   isRequired = true,
   isCaseExact = false,
   mutability = AttributeDefinition.Mutability.READ_WRITE,
   returned = AttributeDefinition.Returned.DEFAULT,
   uniqueness = AttributeDefinition.Uniqueness.SERVER)
private String userName;

@Attribute(description = "The components of the user's real name.",
   isRequired = false,
   mutability = AttributeDefinition.Mutability.READ_WRITE,
   returned = AttributeDefinition.Returned.DEFAULT,
   uniqueness = AttributeDefinition.Uniqueness.NONE)
// Note that "name" is a complex attribute, so it is
// represented by the Name class.
private Name name;

// A default no-argument constructor is implied.

// Basic getters and setters are provided.
public String getUserName()
{
 return userName;
}

// Setters return this instance so that they may be chained
// from the constructor.
public UserResource setUserName(final String userName)
{
 this.userName = userName;
 return this;
}

public Name getName()
{
 return name;
}

public UserResource setName(final Name name)
{
 this.name = name;
 return this;
}
}