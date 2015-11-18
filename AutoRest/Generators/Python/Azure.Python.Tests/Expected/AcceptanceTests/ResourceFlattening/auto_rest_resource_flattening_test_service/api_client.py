# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------


from msrest.service_client import ServiceClient, async_request
from msrest import Configuration, Serializer, Deserializer
from msrest.exceptions import (
    SerializationError,
    DeserializationError,
    TokenExpiredError,
    ClientRequestError,
    HttpOperationError)
import uuid
from . import models


class AutoRestResourceFlatteningTestServiceConfiguration(Configuration):

    def __init__(self, credentials, base_url=None, filepath=None):

        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestResourceFlatteningTestServiceConfiguration, self).__init__(base_url, filepath)

        self.credentials = credentials


class AutoRestResourceFlatteningTestService(object):

    def __init__(self, config):

        self._client = ServiceClient(config.credentials, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config

    def _parse_url(self, name, value, datatype):

        try:
            value = self._serialize.serialize_data(value, str(datatype))

        except ValueError:
            raise ValueError("{} must not be None.".format(name))

        except DeserializationError:
            raise TypeError("{} must be type {}.".format(name, datatype))

        else:
            return value

    @async_request
    def put_array(self, resource_array, custom_headers={}, raw=False, callback=None):
        """

        Put External Resource as an Array

        :param resource_array: External Resource as an Array to put
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type resource_array: list or none
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azure/resource-flatten/array'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        if self.config.acceptlanguage is not None:
            query['accept-language'] = self.config.acceptlanguage
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct body
        content = self._serialize(resource_array, '[Resource]')

        # Construct and send request
        request = self._client.put(url, query)
        response = self._client.send(request, headers, content)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response

    @async_request
    def get_array(self, custom_headers={}, raw=False, callback=None):
        """

        Get External Resource as an Array

        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: list or (list, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azure/resource-flatten/array'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        if self.config.acceptlanguage is not None:
            query['accept-language'] = self.config.acceptlanguage
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('[FlattenedProduct]', response)

        if raw:
            return deserialized, response

        return deserialized

    @async_request
    def put_dictionary(self, resource_dictionary, custom_headers={}, raw=False, callback=None):
        """

        Put External Resource as a Dictionary

        :param resource_dictionary: External Resource as a Dictionary to put
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type resource_dictionary: object or none
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azure/resource-flatten/dictionary'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        if self.config.acceptlanguage is not None:
            query['accept-language'] = self.config.acceptlanguage
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct body
        content = self._serialize(resource_dictionary, '{FlattenedProduct}')

        # Construct and send request
        request = self._client.put(url, query)
        response = self._client.send(request, headers, content)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response

    @async_request
    def get_dictionary(self, custom_headers={}, raw=False, callback=None):
        """

        Get External Resource as a Dictionary

        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: object or (object, requests.response) or
        concurrent.futures.Future
        """

        # Construct URL
        url = '/azure/resource-flatten/dictionary'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        if self.config.acceptlanguage is not None:
            query['accept-language'] = self.config.acceptlanguage
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('{FlattenedProduct}', response)

        if raw:
            return deserialized, response

        return deserialized

    @async_request
    def put_resource_collection(self, resource_complex_object, custom_headers={}, raw=False, callback=None):
        """

        Put External Resource as a ResourceCollection

        :param resource_complex_object: External Resource as a
        ResourceCollection to put
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type resource_complex_object: object or none
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azure/resource-flatten/resourcecollection'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        if self.config.acceptlanguage is not None:
            query['accept-language'] = self.config.acceptlanguage
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct body
        content = self._serialize(resource_complex_object, 'ResourceCollection')

        # Construct and send request
        request = self._client.put(url, query)
        response = self._client.send(request, headers, content)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response

    @async_request
    def get_resource_collection(self, custom_headers={}, raw=False, callback=None):
        """

        Get External Resource as a ResourceCollection

        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: object or (object, requests.response) or
        concurrent.futures.Future
        """

        # Construct URL
        url = '/azure/resource-flatten/resourcecollection'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        if self.config.acceptlanguage is not None:
            query['accept-language'] = self.config.acceptlanguage
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('ResourceCollection', response)

        if raw:
            return deserialized, response

        return deserialized
